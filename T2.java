

def remove_all(stack):
    """
    Remove all elements from the given stack recursively.
    """
    if not stack.is_empty():
        stack.pop()
        remove_all(stack)
