#!/bin/bash -x

. ./medex.ini

dropdb $MEDEX_DBNAME -U $POSTGRES_USER -h $POSTGRES_HOST

createdb $MEDEX_DBNAME -U $POSTGRES_USER -h $POSTGRES_HOST

psql -U $POSTGRES_USER -d $MEDEX_DBNAME -f 00_user.sql

psql -U $MEDEX_USER -d $MEDEX_DBNAME -f 01_schema.sql
