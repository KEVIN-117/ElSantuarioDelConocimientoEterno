"use client"
import { useState } from 'react'
import { Square } from '../components/Square'
import { CalculateWinner } from '../utils/Winner'
import { handleConfetti } from '../utils/Congratulations'
export function Board() {

    const [xIsNext, setXisNext] = useState(true)
    const [tableValue, setTableValue] = useState(Array(9).fill(null))
    // console.log(typeof tableValue)

    function handleClick(index: number) {
        if (CalculateWinner(tableValue) || tableValue[index]) {
            return;
        }
        const nextSquare = tableValue.slice();
        if (xIsNext) {
            nextSquare[index] = 'X';
        } else {
            nextSquare[index] = 'O';
        }
        setTableValue(nextSquare);
        setXisNext(!xIsNext);
    }
    const winner = CalculateWinner(tableValue);
    let status;
    if (winner) {
        handleConfetti()
        status = 'Winner: ' + winner;
    } else {
        status = 'Next player: ' + (xIsNext ? 'X' : 'O');
    }
    const resertGame = () => {
        setTableValue(Array(9).fill(null))

    }
    return (
        <>
            <div className='status'>{status}</div>
            <div className='board-row'>
                <Square value={tableValue[0]} onSquareClick={() => { handleClick(0) }} />
                <Square value={tableValue[1]} onSquareClick={() => { handleClick(1) }} />
                <Square value={tableValue[2]} onSquareClick={() => { handleClick(2) }} />
            </div>
            <div className='board-row'>
                <Square value={tableValue[3]} onSquareClick={() => { handleClick(3) }} />
                <Square value={tableValue[4]} onSquareClick={() => { handleClick(4) }} />
                <Square value={tableValue[5]} onSquareClick={() => { handleClick(5) }} />
            </div>
            <div className='board-row'>
                <Square value={tableValue[6]} onSquareClick={() => { handleClick(6) }} />
                <Square value={tableValue[7]} onSquareClick={() => { handleClick(7) }} />
                <Square value={tableValue[8]} onSquareClick={() => { handleClick(8) }} />
            </div>
            <div className='flex justify-center items-center mt-4'>
                <button className='rounded-full bg-red-600 px-4 py-2 text-xl font-bold uppercase' onClick={resertGame}>{winner ? 'Iniciar nuevo Juego' : 'Reiniciar'}</button>
            </div>
        </>
    )
}