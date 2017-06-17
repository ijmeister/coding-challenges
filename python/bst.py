# print [ i for i in range(10) ]
def binarysearch(arr, num):
    """
    initialize low = 0, high = N, mid = (low + high)/2
    check if element is at position mid; if found, return
    else depending upon value of mid is lower or greater, we explore the right side of the array or the left side
    """
    low = 0
    mid = 0
    high = len(arr) - 1 # -1 because index starts from zero
    # mid = (low + high) / 2
    while low <= high:
        # find the mid
        mid = int(round((low + high) / 2))

        # if num is equal to index at mid
        if(num == arr[ mid ]):
            return mid

        if(num > arr[ mid ]):
            low = mid + 1
        else:
            high = mid - 1
    return -1

print binarysearch([1, 2, 3, 4, 5], 1)
print binarysearch([1, 2, 3, 4, 5], 2)
print binarysearch([1, 2, 3, 4, 5], 3)
print binarysearch([1, 2, 3, 4, 5], 4)
print binarysearch([1, 2, 3, 4, 5], 5)
