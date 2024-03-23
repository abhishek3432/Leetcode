class FooBar {
    private int n;
    private AtomicBoolean fooFlag;
    private AtomicBoolean barFlag;

    public FooBar(int n) {
        this.n = n;
        fooFlag = new AtomicBoolean(true);
        barFlag = new AtomicBoolean(false);
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(!fooFlag.get()) {

            }
            fooFlag.set(false);
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            barFlag.set(true);
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(!barFlag.get()) {

            }
            barFlag.set(false);
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            fooFlag.set(true);
        }
    }
}