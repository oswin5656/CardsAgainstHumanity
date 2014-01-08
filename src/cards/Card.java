package cards;

import import_export.Saver;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * A type object that represents a card.
 * The type of card is determined by which subclass({@linkplain QuestionCard} or {@linkplain AnswerCard}) is used.
 * The class card by its self is never intended to be used, but is meant to be used for its subclasses constructors and methods.
 * The classes {@linkplain QuestionCard} and {@linkplain AnswerCard} are different because questionCards allow the card to require
 *  the user to play or draw a certain number of cards.
 * @see {@linkplain Deck}, {@linkplain QuestionCard}, {@linkplain AnswerCard}
 * @author Holt Maki
 * @since CAH1.0
 * @version CAH1.0
 */
public class Card {
	private String cardString;
	private ArrayList<Tag> tags;
	//TODO Make it so that each prefix & folder will have their own numbering so that multiple decks can be combined without problems.
	
	
	private CardHistory history;//TODO Make this when the card is created to help the AI understand the cards better
	
	/**
	 * Creates a card.
	 * The type of card is determined by which subclass({@linkplain questionCard} or {@linkplain answerCard}) is used.
	 * The class card by its self is never intended to be used, but is meant to be used for its subclasses constructors and methods.
	 * The classes {@linkplain questionCard} and {@linkplain answerCard} are different because questionCards allow the card to require the user to play or draw a certain number of cards.
	 * @param card - the writing that will be on the card. {@link #cardString} = card.
	 * @since CAH1.0
	 * @see {@linkplain answerCard}, {@linkplain questionCard}
	 */
	public Card(String card)
	{		
		cardString = card;
	}
	
	/**
	 * Adds a tag to the card. 
	 * This allows cards to be sorted by the computer so that it can better understand what people find funny.
	 * It is also used by impersonators to best imitate the the person that it is impersonating.
	 * @param {@link #aTag} - the {@linkplain tag} that will be attached to the card.
	 * @since CAH1.0
	 * @see {@linkplain tag}
	 */
	
	public void addTag(Tag aTag)
	{
		tags.add(aTag);
	}
	
	protected void setCardString(String cardStr)
	{
		cardString = cardStr;
	}
	
	/**
	 * Gets the writing on the card.
	 * @since CAH1.0
	 * @return {@link #cardString} - The String that is made up of the text that the card has written on it.
	 */
	public String getCardString()
	{
		return cardString;
	}

}
