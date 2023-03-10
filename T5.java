








from typing import List

def evaluate_postfix(postfix: str) -> int:
    stack: List[int] = []
    tokens: List[str] = postfix.split()

    for token in tokens:
        if token.isdigit():
            stack.append(int(token))
        else:
            b: int = stack.pop()
            a: int = stack.pop()
            if token == '+':
                stack.append(a + b)
            elif token == '-':
                stack.append(a - b)
            elif token == '*':
                stack.append(a * b)
            elif token == '/':
                stack.append(a / b)

    return stack.pop()

postfix_expression: str = input("Enter postfix expression: ")
result: int = evaluate_postfix(postfix_expression)
print(f"Result: {result}")





