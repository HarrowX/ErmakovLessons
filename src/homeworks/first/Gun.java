package homeworks.first;


public class Gun {
    int ammo;

    public Gun(int ammo) {
        this.ammo = ammo;
    }

    public Gun() {
        this(5);
    }

    public void fire() {
        if (ammo > 0) {
            ammo--;
            System.out.println("БАБАХ!!!");
            return;
        }
        System.out.println("КЛАЦ!!!");
    }
}
class TestGun {
    public static void main(String[] args) {
        Gun gun = new Gun(3);
        for (int i = 0; i < 5 ; i++) {
            gun.fire();
        }
    }
}
