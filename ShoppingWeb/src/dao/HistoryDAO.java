package dao;

import java.util.List;

import model.History;

public interface HistoryDAO {
	
	//thÃªm má»›i má»™t lá»‹ch sá»­ mua hÃ ng.
	public void addHistory(History h);
	//this is a project new
	//lá»�c lá»‹ch sá»­ cá»§a khÃ¡ch hÃ ng.
	public List<History> getList(int user_id);

}
