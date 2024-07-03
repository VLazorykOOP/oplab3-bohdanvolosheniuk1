public class Context {
    private State state;

    public Context() {
        // Початковий стан
        this.state = new ConcreteStateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.doAction(this); // Викликаємо метод doAction на поточному стані
    }
}
