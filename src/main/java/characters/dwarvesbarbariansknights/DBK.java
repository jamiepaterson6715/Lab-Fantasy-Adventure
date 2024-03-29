package characters.dwarvesbarbariansknights;

import characters.Player;

public abstract class DBK extends Player {

    private WeaponType weaponType;

    public DBK(String name, WeaponType weaponType) {
        super(name);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public abstract double attack();
}
