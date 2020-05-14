/*
1. Расставь правильно наследование между Building(здание) и School(здание школы).
2. Подумай, объект какого класса должен возвращать методы getSchool и getBuilding.
3. Измени null на объект класса Building или School.*/
public class Main {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();
        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        return new School();
    }

    public static Building getBuilding() {
        return new Building();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School1";
        }
    }

    static class Building  {
        @Override
        public String toString() {
            return "Building1";
        }
    }
}
