class ConcreteStateA implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Context is in state A");
        // Встановлюємо новий стан для context
        context.setState(new ConcreteStateB());
    }
}