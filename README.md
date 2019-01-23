### How to run this automated test

### Windows
1. Download and install eclipse latest version at [eclipse website](https://www.eclipse.org/downloads/)
2. Download latest Chromedriver at [google website](https://sites.google.com/a/chromium.org/chromedriver/)
3. Download latest version of Selenium Standalone Server at [selenium website](https://www.seleniumhq.org/download/)
4. Clone this project and open it on eclipse IDE
5. Move both **chromedriver** and **selenium standalone server** files to `c:/drivers` 
6. Update project by using `Alt + F5` 
7. Open project folder on **command prompt** and type **mvn test**

### Troubleshoot
* If **Selenium Standalone Server** is not found, please add it to buildpath from 'c:/drivers' `Project > Java Build Path > Libraries > Add External JARs > Select file > Apply > Apply and Close`
* Update project by using `Alt + F5` 
