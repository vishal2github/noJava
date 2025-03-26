# **DESKTOP APPLICATION**

<br>

### **Desktop application**

+ The application that runs on the desktop locally.

+ To make an application, basically three layers are needed:
  
  + **Presentation layer** _(To accept user-input and display output)_
  
  + **Business layer** _(Algorithm related)_
  
  + **Data layer** _(To store the game data permanently)_

<br>

### **Presentation layer**

+ It is UI of the application.

+ The role of this layer is only to accept input from the user and display output to the user.

<br>

### **Building GUI**

+ GUI will be created by assembling several components:
  
  + Frame, button, label, textbox, passwordbox, etc.

<br>

```
  NOTE
  
    • Java says component, HTML says element, C# says control.
    
    • All are same in task and purpose.
```

<br>

+ In Java, every component is represented in the form of an object.

+ Code to create these object(s) will be written by a UI developer.

+ Classes of these components are predefined under **javax.swing** package.

+ Few classes are as follows:
  
  + JFrame
  
  + JButton
  
  + JLabel
  
  + JTextField
  
  + JPasswordField
  
  + JCheckBox
  
  + JRadioButton
  
  + JComboBox
  
  + JList
  
  + etc...

<br>

### **Frame of the UI**

+ It is main component of UI and container of other components.

+ Other components like combobox, textfield, checkbox, radiobutton, etc.

+ It is by default invisible, and size _(width and height)_ of the frame is also "zero".
