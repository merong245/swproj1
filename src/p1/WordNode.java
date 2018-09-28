package p1;
import p1.Pair;

public class WordNode {
	
	private Pair<String,String> wordmean;	//wordmean Pair
	private WordNode pLeft;					// BST Left Pointer
	private WordNode pRight;				// BST Right Pointer
	private WordNode pNext;					// Queue Next Pointer
	
	WordNode()
	{
		wordmean.first=wordmean.second=null;
		pLeft=pRight=pNext=null;
	}

	public String GetWord()
	{
		return wordmean.first;
	}
	public String GetMean()
	{
		return wordmean.second;
	}
	public WordNode GetLeft()
	{
		return pLeft; 
	}
	public WordNode GetRight()
	{
		return pRight;
	}
	public WordNode GetNext()
	{
		return pNext;
	}
	public void	SetWord(String word)
	{
		this.wordmean.first=wordmean.first;
	}
	public void SetMean(String mean)
	{
		this.wordmean.second=wordmean.second;
	}
	public void	SetLeft(WordNode node)
	{
		pLeft=node.pLeft;
	}
	public void	SetRight(WordNode node)
	{
		pRight=node.pRight;
	}
	public void	SetNext(WordNode node)
	{
		pNext=node.pNext;
	}	
}
