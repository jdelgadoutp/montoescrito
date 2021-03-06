package MontoEscrito;

import com.sun.istack.internal.NotNull;

public class MontoEscrito {

	public String ValorLetras(String cadena) {

		String valorletras = "";

		// Verifico el tama�o de la cadena para rellenar con ceros los las posiciones
		// faltantes

		if (cadena.length() == 1) {
			cadena = "000" + cadena;
		}

		if (cadena.length() == 2) {
			cadena = "00" + cadena;
		}

		if (cadena.length() == 3) {
			cadena = "0" + cadena;
		}

		// Caso para obtener el valor de las unidades de mil.

		switch (cadena.substring(0, 1)) {

		case "1":
			if (cadena.subSequence(1, 2).equals("0") && cadena.subSequence(2, 3).equals("0")
					&& cadena.subSequence(3, 4).equals("0"))
				valorletras = "MIL";
			else
				valorletras = "MIL ";

			break;

		case "2":
			if (cadena.subSequence(1, 2).equals("0") && cadena.subSequence(2, 3).equals("0")
					&& cadena.subSequence(3, 4).equals("0"))
				valorletras = "DOS MIL";
			else
				valorletras = "DOS MIL ";
			break;

		case "3":
			if (cadena.subSequence(1, 2).equals("0") && cadena.subSequence(2, 3).equals("0")
					&& cadena.subSequence(3, 4).equals("0"))
				valorletras = "TRES MIL";
			else
				valorletras = "TRES MIL ";
			break;

		case "4":
			if (cadena.subSequence(1, 2).equals("0") && cadena.subSequence(2, 3).equals("0")
					&& cadena.subSequence(3, 4).equals("0"))
				valorletras = "CUATRO MIL";
			else
				valorletras = "CUATRO MIL ";
			break;

		case "5":
			if (cadena.subSequence(1, 2).equals("0") && cadena.subSequence(2, 3).equals("0")
					&& cadena.subSequence(3, 4).equals("0"))
				valorletras = "CINCO MIL";
			else
				valorletras = "CINCO MIL ";

			break;

		case "6":
			if (cadena.subSequence(1, 2).equals("0") && cadena.subSequence(2, 3).equals("0")
					&& cadena.subSequence(3, 4).equals("0"))
				valorletras = "SEIS MIL";
			else
				valorletras = "SEIS MIL ";
			break;

		case "7":
			if (cadena.subSequence(1, 2).equals("0") && cadena.subSequence(2, 3).equals("0")
					&& cadena.subSequence(3, 4).equals("0"))
				valorletras = "SIETE MIL";
			else
				valorletras = "SIETE MIL ";
			break;

		case "8":
			if (cadena.subSequence(1, 2).equals("0") && cadena.subSequence(2, 3).equals("0")
					&& cadena.subSequence(3, 4).equals("0"))
				valorletras = "OCHO MIL";
			else
				valorletras = "OCHO MIL ";
			break;

		case "9":
			if (cadena.subSequence(1, 2).equals("0") && cadena.subSequence(2, 3).equals("0")
					&& cadena.subSequence(3, 4).equals("0"))
				valorletras = "NUEVE MIL";
			else
				valorletras = "NUEVE MIL ";
			break;

		case "0":
			valorletras = "";

			break;

		default:
			break;
		}

		// Caso para obtener el valor de las unidades de cien.

		switch (cadena.substring(1, 2)) {

		case "1":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "CIEN";

			} else
				valorletras = valorletras + "CIENTO ";

			break;

		case "2":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "DOSCIENTOS";

			} else
				valorletras = valorletras + "DOSCIENTOS ";

			break;

		case "3":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "TRESCIENTOS";

			} else
				valorletras = valorletras + "TRESCIENTOS ";

			break;

		case "4":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "CUATROCIENTOS";

			} else
				valorletras = valorletras + "CUATROCIENTOS ";

			break;

		case "5":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "QUINIENTOS";

			} else
				valorletras = valorletras + "QUINIENTOS ";

			break;

		case "6":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "SEISCIENTOS";

			} else
				valorletras = valorletras + "SEISCIENTOS ";

			break;

		case "7":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "SETECIENTOS";

			} else
				valorletras = valorletras + "SETECIENTOS ";

			break;

		case "8":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "OCHOCIENTOS";

			} else
				valorletras = valorletras + "OCHOCIENTOS ";

			break;

		case "9":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "NOVECIENTOS";
			} else
				valorletras = valorletras + "NOVECIENTOS ";

			break;

		case "0":
			valorletras = valorletras + "";

			break;

		default:
			break;
		}

		// Caso para obtener el valor de las unidades de diez.

		switch (cadena.substring(2, 3)) {

		case "1": {

			// Validaci�n numeros del 10 al 19

			if (cadena.substring(3, 4).equals("1"))
				valorletras = valorletras + "ONCE";
			if (cadena.substring(3, 4).equals("2"))
				valorletras = valorletras + "DOCE";
			if (cadena.substring(3, 4).equals("3"))
				valorletras = valorletras + "TRECE";
			if (cadena.substring(3, 4).equals("4"))
				valorletras = valorletras + "CATORCE";
			if (cadena.substring(3, 4).equals("5"))
				valorletras = valorletras + "QUINCE";
			if (cadena.substring(3, 4).equals("6"))
				valorletras = valorletras + "DIECI";
			if (cadena.substring(3, 4).equals("7"))
				valorletras = valorletras + "DIECI";
			if (cadena.substring(3, 4).equals("8"))
				valorletras = valorletras + "DIECI";
			if (cadena.substring(3, 4).equals("9"))
				valorletras = valorletras + "DIECI";
			if (cadena.substring(3, 4).equals("0"))
				valorletras = valorletras + "DIEZ";

		}

			break;

		case "2":
			if (cadena.substring(3, 4).equals("0"))
				valorletras = valorletras + "VEINTE";
			else
				valorletras = valorletras + "VEINTI ";

			break;

		case "3":
			if (cadena.substring(3, 4).equals("0"))
				valorletras = valorletras + "TREINTA";
			else
				valorletras = valorletras + "TREINTA Y ";

			break;

		case "4":
			if (cadena.substring(3, 4).equals("0"))
				valorletras = valorletras + "CUARENTA";
			else
				valorletras = valorletras + "CUARENTA Y ";
			break;

		case "5":
			if (cadena.substring(3, 4).equals("0"))
				valorletras = valorletras + "CINCUENTA";
			else
				valorletras = valorletras + "CINCUENTA Y ";
			break;

		case "6":
			if (cadena.substring(3, 4).equals("0"))
				valorletras = valorletras + "SESENTA";
			else
				valorletras = valorletras + "SESENTA Y ";

			break;

		case "7":
			if (cadena.substring(3, 4).equals("0"))
				valorletras = valorletras + "SETENTA";
			else
				valorletras = valorletras + "SETENTA Y ";
			break;

		case "8":
			if (cadena.substring(3, 4).equals("0"))
				valorletras = valorletras + "OCHENTA";
			else
				valorletras = valorletras + "OCHENTA Y ";
			break;

		case "9":
			if (cadena.substring(3, 4).equals("0"))
				valorletras = valorletras + "NOVENTA";
			else
				valorletras = valorletras + "NOVENTA Y ";
			break;

		case "0":
			valorletras = valorletras + "";

			break;

		default:
			break;
		}

		// Caso para obtener el valor de las unidades.

		switch (cadena.substring(3, 4)) {

		case "1":
			if (!cadena.substring(2, 3).equals("1"))
				valorletras = valorletras + "UNO";

			break;

		case "2":
			if (!cadena.substring(2, 3).equals("1"))
				valorletras = valorletras + "DOS";

			break;

		case "3":
			if (!cadena.substring(2, 3).equals("1"))
				valorletras = valorletras + "TRES";

			break;

		case "4":
			if (!cadena.substring(2, 3).equals("1"))
				valorletras = valorletras + "CUATRO";

			break;

		case "5":
			if (!cadena.substring(2, 3).equals("1"))
				valorletras = valorletras + "CINCO";
			break;

		case "6":
			valorletras = valorletras + "SEIS";

			break;

		case "7":
			valorletras = valorletras + "SIETE";

			break;

		case "8":
			valorletras = valorletras + "OCHO";

			break;

		case "9":
			valorletras = valorletras + "NUEVE";

			break;

		case "0":
			if (cadena.substring(2, 3).equals("0") && cadena.substring(3, 4).equals("0")) {
				valorletras = valorletras + "";
			}

			break;

		default:
			break;
		}

		return valorletras.toUpperCase();
	}

}
