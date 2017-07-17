#!/bin/python

import sys
import re

N = int(raw_input().strip())
mylist = []
for a0 in xrange(N):
    firstName,emailID = raw_input().strip().split(' ')
    firstName,emailID = [str(firstName),str(emailID)]

    if re.search('\w*@gmail.com$', emailID):
        # print 'match'
        mylist.append(firstName)

mylist.sort()
print '\n'.join(mylist)
