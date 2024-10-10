package homeworks.first;


import homeworks.first.office.Employee;
import lombok.Getter;

@Getter
public class Gun {
    private int totalAmmo;
    private int currentAmmoCartridge;
    private final int maxAmmoCartridge;
    private final int maxTotalAmmo;

    private static final int DEFAULT_TOTAL_AMMO = 27;
    private static final int DEFAULT_CURRENT_AMMO_CARTRIDGE = 9;

    public Gun(int currentAmmoCartridge, int totalAmmo, int maxAmmoCartridge, int maxTotalAmmo) {
        if (currentAmmoCartridge < 0) throw new IllegalArgumentException();
        if (totalAmmo < 0) throw new IllegalArgumentException();
        if (maxAmmoCartridge < 0) throw new IllegalArgumentException();
        if (maxTotalAmmo < 0) throw new IllegalArgumentException();
        if (currentAmmoCartridge > maxAmmoCartridge) throw new IllegalArgumentException();
        if (totalAmmo > maxTotalAmmo) throw new IllegalArgumentException();
        if (currentAmmoCartridge > totalAmmo) throw new IllegalArgumentException();
        this.currentAmmoCartridge = currentAmmoCartridge;
        this.totalAmmo = totalAmmo;
        this.maxAmmoCartridge = maxTotalAmmo;
        this.maxTotalAmmo = maxTotalAmmo;
    }

    public boolean isLoad() {
        return currentAmmoCartridge != 0;
    }

    public boolean fire() {
        if (isLoad()) {
            System.out.println("бах");
            currentAmmoCartridge--;
            totalAmmo--;
            return true;
        }
        System.out.println("клац");

        return false;
    }

    public boolean reload() {
        if (totalAmmo > 0) {
            currentAmmoCartridge = Math.min(totalAmmo, maxAmmoCartridge);
            return true;
        }
        return false;
    }

    public Gun(int currentAmmoCartridge, int totalAmmo) {
        this(currentAmmoCartridge, totalAmmo, DEFAULT_CURRENT_AMMO_CARTRIDGE, DEFAULT_TOTAL_AMMO);
    }

    public Gun() {
        this(DEFAULT_CURRENT_AMMO_CARTRIDGE, DEFAULT_TOTAL_AMMO);
    }

}

class TestGun {
    public static void main(String[] args) {
        Gun gun = new Gun();

    }
}
