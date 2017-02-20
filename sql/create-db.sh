#!/bin/bash -x

. ./medex.ini

dropdb $MEDEX_DBNAME -U $POSTGRES_USER -h $POSTGRES_HOST

createdb $MEDEX_DBNAME -U $POSTGRES_USER -h $POSTGRES_HOST

psql -U $MEDEX_USER -d $MEDEX_DBNAME -f 01_schema.sql