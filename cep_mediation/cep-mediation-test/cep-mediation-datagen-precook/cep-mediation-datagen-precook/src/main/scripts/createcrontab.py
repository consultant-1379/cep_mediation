#!/usr/bin/bash

 echo "creating crontab"
        if [ -f '/tmp/cron_job.backup' ]; then
                echo "remove old cron_job.backup file"
                rm -f '/tmp/cron_job.backup'
        fi
        echo "create a backup file for the existing cron job"
        crontab -l > /tmp/cron_job.backup
        echo "create a temp file for the existing cron job"
        crontab -l > /tmp/cron_job.tmp

        sed -e '/delete_old_files.py/d' /tmp/cron_job.tmp > /tmp/cron_job.tmp.1
        rm -rf /tmp/cron_job.tmp

        echo "0,30 * * * * python /opt/datagen/bin/utils/delete_old_files.py 1 /opt/datagen/bin/utils/clean_list >> /var/log/delete_old_files.log 2>&1" >> /tmp/cron_job.tmp.1
        chmod 755 /tmp/cron_job.tmp.1
        crontab /tmp/cron_job.tmp.1
        # remove temp file
        rm -f /tmp/cron_job.tmp.1
