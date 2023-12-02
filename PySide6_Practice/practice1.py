from PySide6.QtWidgets import QApplication, QWidget, QPushButton, QMainWindow
import sys

app = QApplication(sys.argv)

window = QMainWindow()
window.show()
buttonholder = QPushButton("push me") #this should be the child
window.set(buttonholder)
window.show()

app.exec() #start the event loop
"""
sys: apploation like a wrapper
Qwidget is hidden
event will capture the button



"""