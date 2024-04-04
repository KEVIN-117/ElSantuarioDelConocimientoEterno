def is_solved(board):
    # TODO: Check if the board is solved!

    lines = [[(0, 0), (1, 1), (2, 2)],
             [(0, 0), (1, 0), (2, 0)],
             [(0, 0), (0, 1), (0, 2)],
             [(1, 0), (1, 1), (1, 2)],
             [(2, 0), (2, 1), (2, 2)],
             [(0, 1), (1, 1), (2, 1)],
             [(0, 2), (1, 2), (2, 2)],
             [(2, 0), (1, 1), (0, 2)]]
    for i in range(len(lines)):
        a, b, c = lines[i]
        # print(board[a[0]][a[1]], board[b[0]][b[1]], board[c[0]][c[1]])
        if board[a[0]][a[1]] != 0 and board[a[0]][a[1]] == board[b[0]][b[1]] and board[b[0]][b[1]] != 0 and board[a[0]][a[1]] == board[c[0]][c[1]] and board[c[0]][c[1]] != 0:
            return board[a[0]][a[1]]
    if not 0 in (valor for fila in board for valor in fila):
        return 0
    return -1

board = [[0, 0, 1],
         [0, 1, 2],
         [2, 1, 0]]
print(is_solved(board))

board = [[1, 1, 1],
         [0, 2, 2],
         [0, 0, 0]]
print(is_solved(board))

board = [[2, 1, 1],
         [0, 2, 2],
         [0, 0, 2]]
print(is_solved(board))

board = [[2, 1, 2],
         [2, 1, 1],
         [1, 2, 1]]
print(is_solved(board))

board = [[0, 0, 2],
         [0, 0, 0],
         [1, 0, 1]]
print(is_solved(board))