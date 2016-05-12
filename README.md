# Corball Demo
Corball demo - The test automation demo. You will need a Saucelabs account if you want to enjoy this demo.

Corball also support local WebDriver/Appium executions and it is based on the Corball Core (https://github.com/Acenhauer/corball-demo)

# WebDriver Demo
You can execute an automated google search using the following command:

    mvn -Dtest=WebDriverTest -Dbrowser=chrome -Dhub=http://127.0.0.1:4444/wd/hub test

Corball supports Saucelabs, you can trigger your changing the Hub url

    mvn -Dtest=WebDriverTest -Dbrowser=chrome -Dhub=http://saucelabs_user@saucelabs_apikey:80/wd/hub test

Corball supports Internet Explorer, Firefox, Opera, Safari and Chrome.

# Safari Mobile Browser Demo (iOS)
You can execute an automated google search using the following command:

    mvn -Dtest=SampleTest -Ddevice=ios -Dplatformversion=9.0 -Dhub=http://saucelabs_user@saucelabs_apikey:80/wd/hub test

# Chrome Mobile Browser Demo (Android)
You can execute an automated google search using the following command:

    mvn -Dtest=SampleTest -Ddevice=android -Dplatformversion=5.0 -Dhub=http://saucelabs_user@saucelabs_apikey:80/wd/hub test

# IOS Native app automated test
You can execute an automated calculator sum using the following command:

    mvn -Dtest=IOSTest -Dhub=http://saucelabs_user@saucelabs_apikey:80/wd/hub test

# Android Native app automated test
You can execute an automated calculator sum using the following command:

    mvn -Dtest=CalculatorTest -Dplatformversion=5.0 -Ddevice=android -DapkAbsolutePath=src/main/resources/app/SimpleCalculator.apk -Dhub=http://saucelabs_user@saucelabs_apikey:80/wd/hub test