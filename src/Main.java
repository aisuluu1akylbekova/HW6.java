public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр оружия для босса
        Weapon bossWeapon = new Weapon(WeaponType.STAFF, "Ancient Staff");

        // Создаем босса
        Boss boss = new Boss("Dark Wizard", 100, bossWeapon);
        boss.printInfo();

        // Создаем экземпляры Skeleton
        Weapon skeletonWeapon = new Weapon(WeaponType.BOW, "Bone Bow");

        Skeleton skeleton1 = new Skeleton("Skeleton Archer 1", 30, skeletonWeapon, 10);
        Skeleton skeleton2 = new Skeleton("Skeleton Archer 2", 30, skeletonWeapon, 15);

        // Печатаем информацию о скелетах
        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}

