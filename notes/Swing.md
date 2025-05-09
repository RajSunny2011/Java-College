# Java Swing

Java **Swing** is a part of the Java Foundation Classes (JFC) used to create **rich graphical user interfaces (GUIs)**. It is built on top of the AWT (Abstract Window Toolkit) and provides a **pluggable, platform-independent UI**.

* * *

## 🔹 Common Swing Components
| Component        | Class            | Description                                         |
| ---------------- | ---------------- | --------------------------------------------------- |
| **Label**        | `JLabel`         | Displays a short string or image icon.              |
| **Button**       | `JButton`        | A push button that performs an action when clicked. |
| **Text Field**   | `JTextField`     | Single-line text input field.                       |
| **Text Area**    | `JTextArea`      | Multi-line area for displaying/editing text.        |
| **Password**     | `JPasswordField` | Single-line field that masks entered text.          |
| **Check Box**    | `JCheckBox`      | Box that can be checked or unchecked.               |
| **Radio Button** | `JRadioButton`   | Used in groups to select only one option.           |
| **Combo Box**    | `JComboBox`      | Drop-down list of items.                            |
| **List**         | `JList`          | Displays a list of items.                           |
| **Table**        | `JTable`         | Displays data in rows and columns.                  |
| **Panel**        | `JPanel`         | Generic container for holding other components.     |
| **Frame**        | `JFrame`         | Main window container for a GUI application.        |
| **Dialog**       | `JDialog`        | Popup window that interacts with users.             |

***

## 🔹 Layout Managers

Layout managers control the size and position of components in a container.
| Layout Manager     | Class           | Description                                                                |
| ------------------ | --------------- | -------------------------------------------------------------------------- |
| **Flow Layout**    | `FlowLayout`    | Places components in a row, left to right.                                 |
| **Border Layout**  | `BorderLayout`  | Divides the container into five regions: North, South, East, West, Center. |
| **Grid Layout**    | `GridLayout`    | Arranges components in a grid of equally sized cells.                      |
| **Box Layout**     | `BoxLayout`     | Aligns components either vertically or horizontally.                       |
| **GridBag Layout** | `GridBagLayout` | Flexible grid layout manager with control over row/column sizes and spans. |

Example: BorderLayout
```java
JFrame frame = new JFrame("BorderLayout Example");
frame.setLayout(new BorderLayout());
frame.add(new JButton("North"), BorderLayout.NORTH);
frame.add(new JButton("South"), BorderLayout.SOUTH);
frame.add(new JButton("East"), BorderLayout.EAST);
frame.add(new JButton("West"), BorderLayout.WEST);
frame.add(new JButton("Center"), BorderLayout.CENTER);
frame.pack();
frame.setVisible(true);
```

## 🔹 Event Listeners

In Swing, **event listeners** handle interactions like button clicks, key presses, etc. They follow the **event delegation model**, which includes:

1.  **Event Source** – the component that generates events.
    
2.  **Event Object** – encapsulates event details.
    
3.  **Event Listener** – interface that receives the event.
    

### Common Listener Interfaces
| Listener Interface | Use Case                     | Common Method                     |
| ------------------ | ---------------------------- | --------------------------------- |
| `ActionListener`   | Button clicks, menu items    | `actionPerformed(ActionEvent)`    |
| `MouseListener`    | Mouse actions (click, enter) | `mouseClicked(MouseEvent)` etc.   |
| `KeyListener`      | Keyboard input               | `keyPressed(KeyEvent)` etc.       |
| `ItemListener`     | ComboBox, CheckBox changes   | `itemStateChanged(ItemEvent)`     |
| `ChangeListener`   | Sliders, spinners, etc.      | `stateChanged(ChangeEvent)`       |
| `WindowListener`   | Window events                | `windowClosing(WindowEvent)` etc. |

### Example: `ActionListener` for a Button

```java
JButton button = new JButton("Click Me");
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");
    }
});
```

### Example: Using Lambda (Java 8+)

```java
JButton button = new JButton("Click Me");
button.addActionListener(e -> System.out.println("Button clicked using lambda!"));
```

* * *

## 🔹 Example: Simple Swing GUI

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleSwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("Click Me!");
        JLabel label = new JLabel("Welcome to Swing!");

        button.addActionListener(e -> label.setText("Button Clicked!"));

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
```

* * *

## 🔹 Summary

-   **Swing** is powerful for building desktop GUI applications.
    
-   Use **components** like `JButton`, `JLabel`, `JTextField` to build UIs.
    
-   Use **layout managers** to control component placement.
    
-   Handle user interaction through **event listeners**.
    
-   Favor **lambda expressions** for concise event handling in Java 8+.
    

* * *

For more information, visit the official documentation:  
[Java Swing Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/)