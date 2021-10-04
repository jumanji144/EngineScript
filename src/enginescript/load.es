function fib(a) {
    when a < 1
        return a;

    return fib(a - 1) + fib(a - 2);
}

entry {

    print("Running entry function");
    fib(a);

}