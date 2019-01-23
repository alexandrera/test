### How to run this automated test

### Windows
1. Download and install eclipse latest version at [eclipse website](https://www.eclipse.org/downloads/)
2. Download latest Chromedriver at [google website](https://sites.google.com/a/chromium.org/chromedriver/)
3. Download latest version of Selenium Standalone Server at [selenium website](https://www.seleniumhq.org/download/)
4. Clone this project and open it on eclipse IDE
5. Move both **chromedriver** and **selenium standalone server** files to `c:/` or desirable folder
6. Update project by using `Alt + F5` 
7. Run the file `Test.java` as `TestNG Test`

### Linux
1. Download and install eclipse latest version at [eclipse website](http://www.eclipse.org/downloads/packages/)
2. Download latest Chromedriver at [google website](https://sites.google.com/a/chromium.org/chromedriver/)
3. Download latest version of Selenium Standalone Server at [selenium website](https://www.seleniumhq.org/download/)
4. Clone this project and open it on eclipse IDE
5. Move both **chromedriver** and **selenium standalone server** files to `/home` or desirable folder
6. Remove comment the code `// public static final String pathProperty = "/home/chromedriver";` and comment `public static final String pathProperty = "C:/chromedriver.exe";`
7. Update project by using `Alt + F5` 
8. Run the file `Test.java` as `TestNG Test`

### Troubleshoot
* If **Selenium Standalone Server** is not found, please add it to buildpath `Project > Java Build Path > Libraries > Add External JARs > Select file > Apply > Apply and Close`
* Update project by using `Alt + F5` 
