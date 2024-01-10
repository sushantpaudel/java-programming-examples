
// EXAMPLE 1
// •	Extend the factory pattern to an abstract factory. Define interfaces "Button" and "Checkbox," and implement classes for "Windows" and "Mac" factories.

public interface Button {
    void click();
}

public interface Checkbox {
    void check();
}

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows checkbox checked");
    }
}

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button clicked");
    }
}

public class MacCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Mac checkbox checked");
    }
}