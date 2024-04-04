import '../styles/layout.css'
import { Board } from '../layouts/Board'

export function Game() {
    return (
        <div className='game'>
            <div className='game-board'>
                <Board />
            </div>
            <div className='game-info'>
                <ol>{/*TODO*/}</ol>
            </div>
        </div>

    )
}