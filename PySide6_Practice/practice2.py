#Version 1
"""
from PySide6.QtWidgets import QApplication, QMainWindow, QPushButton
import sys

app = QApplication(sys.argv)

window = QMainWindow()
window.setWindowTitle("Our first MainWindow App!")

button = QPushButton()
button.setText("Press ME!")

window.setCentralWidget(button) 
#to locate the button in the main window, I think

window.show()
app.exec()

"""

#VERSION2: Setting Up A separate class
"""
from PySide6.QtWidgets import QApplication, QMainWindow, QPushButton
import sys

class ButtonHolder(QMainWindow): #buttonholder class is inheritate from Qmainwindow class
    def __init__(self):
        super().__init__() #basically its the same as parent class, its exacltly the same
        self.setWindowTitle("Button Holder App") #define action
        button = QPushButton("Press Me!") #define parameter only use in class
        self.setCentralWidget(button)

app = QApplication(sys.argv)

window = ButtonHolder()

window.show()
app.exec()

"""



#VERSION3
import sys
from PySide6.QtWidgets import QApplication
from button_holder import ButtonHolder 

app = QApplication(sys.argv)

window = ButtonHolder()

window.show()
app.exec()
