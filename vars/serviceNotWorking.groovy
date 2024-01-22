#!/bin/bash

services="sshd jenkins java docker"
for i in $services
do
	ps -C $i
	if [ $? -ne 0 ]
	then
	echo "$i" >> mail_details
	fi
done
if [ -s mail_details ]
then
	cat mail_details | mail -s "services is not working" varsha88janu@gmail.com
	rm mail_details
fi

