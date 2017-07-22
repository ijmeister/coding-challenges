# https://www.hackerrank.com/challenges/zipped/problem

if __name__ == '__main__':
    # handle input
    stu_no, sub_no = raw_input().strip().split( ' ' )
    marks_list = []

    for i in xrange( int( sub_no )):
        marks_per_sub = raw_input().strip().split( ' ' )
        marks_per_sub = map( float, marks_per_sub )
        marks_list.append( marks_per_sub )

    zipped = zip( *marks_list )
    for i in zipped:
        print sum( i ) / ( sub_no )
