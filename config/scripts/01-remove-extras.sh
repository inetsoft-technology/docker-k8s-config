#!/usr/bin/env bash

# Removes the MySQL driver from the drivers directory so that it can
# be used for the configuration/auditing database. The driver is included
# in the lib directory.

rm -f $STAGING_DIR/drivers/mysql-*.jar
