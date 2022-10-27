package edu.kosa.model;

import java.util.List;

public interface GogakDAO {
	public List listGogak();
	public  void insertGogak(GogakDTO dto);
	public  void updateGogak(GogakDTO dto);
	public  void deleteGogak(GogakDTO dto);
}
