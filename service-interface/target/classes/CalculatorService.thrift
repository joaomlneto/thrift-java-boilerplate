namespace java io.github.joaomlneto

enum Operation {
    ADD, SUB, MUL, DIV
}

exception InvalidOperationException {
    1:i32 what,
    2:string why
}

service CalculatorService {
    i32 add(1:i32 a, 2:i32 b)
    i32 execute(1:Operation op, 2:i32 a, 3:i32 b) throws (1:InvalidOperationException e)
}