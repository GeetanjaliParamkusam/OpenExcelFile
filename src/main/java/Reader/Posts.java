package Reader;

public class Posts {
	
	public int id;
	public String title;
	public String content;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Posts [id=" + id + ", title=" + title + ", content=" + content
				+ "]";
	}
	
	
}
