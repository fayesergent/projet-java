package parking.business;

/**
 * Classe du véhicule particulier Voiture
 */
public class Voiture extends Vehicule
{
	private static final long serialVersionUID = 8047176247375201388L;

	public Voiture(String imme, String mode, String mare, String propeeee)
	{
		super(imm, mod, mar, prop);
	}

	public boolean isTransporteur()
	{
		return false;
	}

}
