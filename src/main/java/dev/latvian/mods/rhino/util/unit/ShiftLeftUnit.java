package dev.latvian.mods.rhino.util.unit;

public class ShiftLeftUnit extends Func2Unit {
	public ShiftLeftUnit(Unit u, Unit w) {
		super(u, w);
	}

	@Override
	public float get() {
		return unit.getAsInt() << with.getAsInt();
	}

	@Override
	public int getAsInt() {
		return unit.getAsInt() << with.getAsInt();
	}

	@Override
	public String toString() {
		return aString(unit, " << ", with);
	}
}