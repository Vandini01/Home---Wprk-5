package MyCar;

  class MessageForProgram {

     static final String GeneralMenu = "\t\tВиберіть частину машини\n1)Вікна та двері\n" +
            "2)Колеса\n3)Загальні данні про машину\n0)Завершити роботу";
      static final String Bye = "Дякую за те що скористалися програмою, гарного дня)";

     ////////////////////////////////  DOOR AND WINDOWS  ////////////////////////
     static final String InputNumbersOfDoors = "Введіть кількість дверей на авто";
      static final String MenuDoorAndWindows = "\t\tВиберіть пункт в меню\n1)Закрити Двері\n2)Відкрити Двері " +
              "\n3)Закрити двері якщо вони відкриті, або відкрити якщо вони закриті " +
              "\n4)Закрити вікно\n5)Відкрити вікно\n6)Закрити вікно якщо воно відкрите, або відкрити якщо воно закрите\n" +
              "7)Вивести стутус\n0)Повернутися до головного меню";
     static final String ChoiceInputStatusOfDoor = "Чи бажаете ввести стан дверей та вікна самостійно" +
             "\n\t\tНІ(0)\t\tТАК(1)";
     static final String ChoiceNumberOfDoor = "Виберіть номер дверей з якими будете працбвати від двері № 1 до двері № ";
      static String InputStatusOfDoor1 = "\t\tВведіть стан дверей № ";
      static final String InputStatusOfDoor2 = "\tЗакриті(0)\t\tВідкриті(1)";
      static String InputStatusOfWindows1 = "\t\tВведіть стан вікна № ";
      static final String InputStatusOfWindows2 = "\tЗакрите(0)\t\tВідкрите(1)";
     static final String NumberDoor = "Двері № ";
     static final String StatusOfWindows = "Стан вікна- ";
      static final String StatusOfDoor = "\tСтан дверей- ";
     static final String Open = "Відкрито\t";
     static final String Close = "Закрито\t";

     //////////////////////////////////  WHEELS   ///////////////////////////////////////
      static final String NumberOfWheel = "Введіть кількість колес- ";
      static final String InputCoefficientEraseOfWheel = "Введіть процент на який буде стерте колесо, від 0 до 100- ";
      static final String MenuWheel = "\t\tВиберіть пункт в меню\n1)Замінити шину на нову\n2)Стерти шину на х% " +
              "\n3)Зняти всі колеса\n4)Встановити нове колесо\n5)Вивести стан колес\n0)Повернутися до головного меню";
      static final String ChoiceNumberOfWheel = "Виберіть номер колеса з якими будете працбвати від колесо № 1 до колесо № ";
      static final String NumberWheel = "Колесо № ";
      static final String StatusOfWheel = " Стан колеса- ";
      static final String ErrorCoefficient = "Неможливо стерти те що вже стерто ";

      ////////////////////////////////    CAR   ///////////////////////////////////////

      static final String DateOfProduction = "03.07.2019";
      static final String TypeMotor = "Electric motor";
      static final String NameCar = "Tesla Model S";
      static final String MenuCar = "\t\tВиберіть пункт в меню\n1)Змінити швидкість авто\n2)Посадити одного пасажира " +
              "\n3)Висадити одного пасажира " +
              "\n4)Висадити всіх пасажирів\n" +
              "5)Вивести всі данні про автомобіль\n" +
              "0)Повернутися до головного меню";
      static final String ChangeSpeed = "Введіть нове значення швидкості автомобіля в данний момент часу від 0 до ";

      static final String MesssageNameCar = "Назва автомобіля - ";
      static final String MesssageTypeMotor = "Тип мотору - ";
      static final String MesssageMaxSpeed = "Максимальна швидкість нового авто - ";
      static final String MesssageAccelerationTo100 = "Розгін до 100 - ";
      static final String MesssageMaxPassenger = "Максимальна кількість пасажирів - ";
      static final String MesssagePassengerInThisMoment = "Кількість пасажирів в данний момент - ";
      static final String MesssageMaxSpeedInThisMoment = "Максимальна швидкість в данний момент - ";
      static final String MesssageSpeedInThisMoment = "Швидкість в данний момент - ";
      static final String Speed = " Км/год.";
      static final String Hours = " Сек.";

     /////////////////////////////////   ERRORS   /////////////////////////////

      static final String ErrorManyNumberOfWheel = "Колеса під таким номером не існує";
      static final String ErrorManyNumberOfDoor = "Дверей під таким номером не існує";
      static final String ErrorInInputNumbersDoors = "Введено некоректне значення, будьласка введіть число від 1 до 9.";
      static final String ErrorInInputChoice = "Введено некоректне значення, будьласка введіть число від 0 до 1.";
     static final String ErrorInInputMenu = "Введено некоректне значення, будьласка введіть число від 0 до 3.";
      static final String ErrorInInputMenuWheel = "Введено некоректне значення, будьласка введіть число від 0 до 5.";
     static final String ErrorInInputMenuDoor = "Введено некоректне значення, будьласка введіть число від 0 до 7.";
      static final String ErrorInInputMenuCarValue = "Введено некоректне значення, будьласка введіть число від 0 до 10.";
      static final String ErrorInInputCoefficient = "Введено некоректне значення, будьласка введіть число від 0 до 100.";
      static final String ErrorInInputSpeedInThisMoment = "Введенно неправильне значення, введіть  від 0 до ";
      static final String  ErrorMaximumReachedOfPassenger = "В машині вже немає місця";
      static final String  ErrorMinimumReachedOfPassenger = "В машині і так нікого немає";
      static final String  ErrorCarWithoutWheels = "В машині відсутні колеса";
      static final String  ErrorNoDriver = "В машині відсутній водій";
  }
