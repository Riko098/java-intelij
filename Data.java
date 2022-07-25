import java.util.Date;

public class Data {
	private Date datap;


	public void dataValida(String date) {
		String[] data = date.split("/");
		if (data.length != 3) {
			setDatap(new Date(01, 01, 0001));
		}
		int dia = Integer.parseInt(data[0]);
		int mes = Integer.parseInt(data[1]);
		int ano = Integer.parseInt(data[2]);
		if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1900 || ano > 2010) {
			setDatap(new Date(01, 01, 0001));
		} else {
			setDatap(new Date(dia, mes, ano));
		}

	}


	public Date getDatap() {
		return datap;
	}

	public void setDatap(Date datap) {
		this.datap = datap;
	}

}