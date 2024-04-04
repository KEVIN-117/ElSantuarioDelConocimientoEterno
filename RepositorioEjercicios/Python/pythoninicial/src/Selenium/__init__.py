import time
# importing webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Here Chrome  will be used
driver = webdriver.Chrome()

# URL of website
url = "https://www.google.com"

# Opening the website
driver.get(url)

# getting the button by class name
buttons = driver.find_elements(By.CLASS_NAME, 'RNmpXc')

# clicking on the button
print(buttons)
buttons.click()
time.sleep(1000)

