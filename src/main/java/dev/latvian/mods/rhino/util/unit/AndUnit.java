package dev.latvian.mods.rhino.util.unit;

public class AndUnit extends Func2Unit {
	public AndUnit(Unit u, Unit w) {
		super(u, w);
	}

	@Override
	public float get() {
		return unit.getAsInt() & with.getAsInt();
	}

	@Override
	public int getAsInt() {
		return unit.getAsInt() & with.getAsInt();
	}

	@Override
	public boolean getAsBoolean() {
		return unit.getAsBoolean() && with.getAsBoolean();
	}

	@Override
	public String toString() {
		return aString(unit, " & ", with);
	}
}