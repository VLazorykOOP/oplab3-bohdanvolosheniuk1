class ConcreteStateB implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Context is in state B");
        // Встановлюємо новий стан для context
        context.setState(new ConcreteStateA());
    }
}