package org.alcobass.films.client.gui.director;

import java.util.ArrayList;
import java.util.List;

import org.alcobass.films.client.ClientDictionaryCache;
import org.alcobass.films.shared.beans.CountryBean;
import org.alcobass.films.shared.beans.DirectorBean;

import com.google.gwt.cell.client.SelectionCell;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DirectorView extends Composite implements DirectorDisplay{
    private VerticalPanel mainPanel;
    private Button deleteButton = new Button("Delete");
    private Button addButton = new Button("Add");
    private CellTable<DirectorBean> dataTable;
    
    private List<DirectorBean> data = null;
    
    public DirectorView() {
        mainPanel = new VerticalPanel();
        
        HorizontalPanel buttonPanel = new HorizontalPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        
        dataTable = new CellTable<DirectorBean>();
        dataTable.addStyleName("directorCellTable");
        TextColumn<DirectorBean> idColumn = new TextColumn<DirectorBean>() {
            
            @Override
            public String getValue(DirectorBean object) {
                return String.valueOf(object.getId());
            }
        };
        
        TextColumn<DirectorBean> nameColumn = new TextColumn<DirectorBean>() {
            
            @Override
            public String getValue(DirectorBean object) {
                return object.getName();
            }
        };
        
        List<String> countries = new ArrayList<String>();
        for (CountryBean countryBean : ClientDictionaryCache.getCountryList()) {
            countries.add(countryBean.getName());
        }
        SelectionCell countryCell = new SelectionCell(countries);
        
        Column<DirectorBean, String> countryColumn = new Column<DirectorBean, String>(countryCell) {
              @Override
              public String getValue(DirectorBean object) {
                return "Later";
              }
            };
        
        dataTable.addColumn(idColumn, "id");
        dataTable.addColumn(nameColumn, "name");
        dataTable.addColumn(countryColumn, "country");

        mainPanel.add(dataTable);
        mainPanel.add(buttonPanel);
        
        initWidget(mainPanel);
    }

    @Override
    public void setDirectorAddHandler(final DirectorAddHandler directorAddHandler) {
        addButton.addClickHandler(new ClickHandler() {
            
            @Override
            public void onClick(ClickEvent event) {
                if (directorAddHandler != null) {
                    directorAddHandler.onDirectorAdd();
                }
                
            }
        });
    }

    @Override
    public void setDirectorDeleteHandler(final DirectorDeleteHandler directorDeleteHandler) {
        deleteButton.addClickHandler(new ClickHandler() {
            
            @Override
            public void onClick(ClickEvent event) {
                if (directorDeleteHandler != null) {
                    directorDeleteHandler.onDirectorDelete(dataTable.getKeyboardSelectedRow());
                }
            }
        });
        
    }

    @Override
    public void setData(List<DirectorBean> data) {
        this.data = data;
    }

    @Override
    public void redraw() {
        dataTable.setRowData(data);
    }
    
    
}
