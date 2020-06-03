package Tema6;

import java.util.*;

public class Student {
	
	String nume ;
	String prenume;
	List<Double> noteRom;
	List<Double> noteMat;
		
	public Student(String nume, String prenume,List<Double> noteRom ,List<Double> noteMat) {
		this.nume = nume;
		this.prenume = prenume;
		this.noteRom = noteRom;
		this.noteMat = noteMat;
	}

	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public String getPrenume() {
		return prenume;
	}


	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public List<Double> getNoteRom() {
		return noteRom;
	}

	public void setNoteRom(List<Double> noteRom) {
		this.noteRom = noteRom;
	}

	public List<Double> getNoteMat() {
		return noteMat;
	}

	public void setNoteMat(List<Double> noteMat) {
		this.noteMat = noteMat;
	}


	@Override
	public String toString() {
		return "[nume=" + nume + ", prenume=" + prenume + ", Note lb.romana:" + noteRom + ", Note Matematica:" + noteMat + "]";
	}
	
}
