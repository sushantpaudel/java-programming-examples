
// EXAMPLE 1
// •	Extend the factory pattern to an abstract factory. Define interfaces "Button" and "Checkbox," and implement classes for "Windows" and "Mac" factories.

interface Button {
    void click();
}

interface Checkbox {
    void check();
}

class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows checkbox checked");
    }
}

class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button clicked");
    }
}

class MacCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Mac checkbox checked");
    }
}

public class AbstractFactoryDesignPattern {

}