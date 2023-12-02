from PySide6.QtWidgets import QMainWindow, QPushButton

class ButtonHolder(QMainWindow): #buttonholder class is inheritate from Qmainwindow class
    def __init__(self):
        super().__init__() #basically its the same as parent class, its exacltly the same
        self.setWindowTitle("Button Holder App") #define action
        button = QPushButton("Press Me!") #define parameter only use in class
        self.setCentralWidget(button)