## Учебный проект по автоматизации тестирования мобильного приложения Wikipedia

<p align="center">
<img title="Wikipedia" src="images/screens/wiki-logo2.png">
</p>


## :maple_leaf:<a name="Содержание">Содержание</a>

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins)
- Allure-отчет
- Интеграция с Allure TestOps
- Интеграция с Atlassian Jira
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

## :maple_leaf:Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://developer.android.com/studio/"><img src="images/logo/androidstudio.svg" width="50" height="50"  alt="AndroidStudio"/></a>
<a href="https://appium.io/"><img src="images/logo/appium.svg" width="50" height="50"  alt="Appium"/></a>
<a href="https://appium.io/"><img src="images/logo/appium-inspector.png" width="50" height="50"  alt="AppiumInspector"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://www.browserstack.com/"><img src="images/logo/browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="images/logo/jira-logo.svg" width="50" height="50"  alt="Atlassian Jira"/></a>
</p>

## :maple_leaf: Список проверок, реализованных в автотестах

- [x] Проверка элементов навигационного меню


## :maple_leaf: Запуск тестов

###  Локальный запуск на эмуляторе:
1. Запуск с командной строки: gradle clean test -DdeviceHost=mobile
2. Получение отчёта: gradle allureServe

###  Настройка Jenkins и удаленный запуск в Browserstack:
1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/C16-NazilyaMullagildina_mobile-tests/">проект</a>

![This is an image](/images/screens/mobile-Jenk-Sobrat-negat.png)

2. Выбрать пункт **Собрать с параметрами**
3. В поля LOGIN и PASSWORD ввести BROWSERSTACK_USERNAME и #BROWSERSTACK_ACCESS_KEY
4. Нажать **Собрать**
5. Результат запуска сборки можно посмотреть в отчёте Allure

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/C16-NazilyaMullagildina_mobile-tests/10/allure/">Allure report</a>

###  Главное окно
<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/mobile-allure-main.png">
</p>


###  Тесты
<p align="center">
<img title="Allure Tests" src="images/screens/mobile-allure-suites.png">
</p>

###  Графики
<p align="center">
<img title="Allure Graphics" src="images/screens/mobile-allure-graph.png">
</p>

## <img src="images/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/1893/dashboards">Allure TestOps</a>
### Cписок всех тест кейсов
<p align="center">
<img title="Allure Graphics" src="images/screens/mobile-ATO-TK.png">
</p>

### Dashboard с результатами тестирования
<p align="center">
<img title="Allure Graphics" src="images/screens/mobile-ATO-main-dashb.png">
</p>

### Пример отчёта выполнения одного из автотестов
<p align="center">
<img title="Allure Graphics" src="images/screens/mobile-ATO-TK-tree.png">
</p>


### Настроен запуск из Allure TestOps выборочных тест-кейсов
<p align="center">
<img title="Allure Graphics" src="images/screens/mobile-run2-TK.png">
</p>

### Формируется Launch, происходит автоматический запуск в Jenkins только отмеченных тест-кейсов
<p align="center">
<img title="Allure Graphics" src="images/screens/mobile-run2-launch.png">
</p>

## <img src="images/logo/jira-logo.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-541">Atlassian Jira</a>
<p align="center">
<img title="Jira" src="images/screens/mobile-Jira.png">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram о результатах прогона тестов

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/mobile-telegram.png" >
</p>

[Вернуться к оглавлению ⬆](#Содержание)
