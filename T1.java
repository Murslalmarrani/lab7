def transfer(S, T):
    """
    Transfer all elements from stack S onto stack T.
    The element at the top of S becomes the first element in T,
    and the element at the bottom of S becomes the top element in T.
    """
    while not S.is_empty():
        T.push(S.pop())
