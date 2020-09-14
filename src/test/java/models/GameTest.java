package models;

import exceptions.GameCompletedException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    private Game game;
    
    @Mock
    private Player player;
    @Mock
    private Spot spot;
    @Mock
    private Dice dice;
    @Spy
    private Board board;


    @Before
    public void setUp() {
        ArrayList<Snake> snakes = new ArrayList<>();
        ArrayList<Ladder> ladders = new ArrayList<>();
        LinkedList<Player> players = new LinkedList<>();
        player = new Player("test");
        players.add(player);
        game = new Game(snakes, ladders, players);
    }

    @Test(expected = GameCompletedException.class)
    public void should_throw_an_exception_if_game_has_ended() throws Exception {
        Spot normalSpot = new Spot(97, new NormalSpot(97));
        player.setPosition(normalSpot);
        when(dice.roll()).thenReturn(3);
        
        
        game.play(dice);
        game.play(dice);
    }

    @Test
    public void should_just_return_if_players_position_is_exceeding_board_size() throws Exception{
        
        when(dice.roll()).thenReturn(103);
        verify(board, never()).getSpotAt(anyInt());

        game.play(dice);
    }


    @Test
    public void should_come_down_from_the_position_if_there_is_a_snake_on_the_position() throws Exception{

        when(dice.roll()).thenReturn(10);
        when(spot.hasSnake()).thenReturn(true);
        verify(board).getSpotAt(10);
        

        game.play(dice);
    }
}