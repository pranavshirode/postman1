import React, { useState } from 'react';
import { Sparkles, Heart, Star, Gift } from 'lucide-react';

        const RandomWishGenerator = () => {
        const [name, setName] = useState('');
  const [wishes, setWishes] = useState([]);

  const wishTemplates = [
        "May all your dreams come true, {name}! ✨",
        "Wishing you a wonderful day ahead, {name}! 🌟",
        "May happiness follow you everywhere, {name}! 😊",
        "Hope you achieve great success, {name}! 🎯",
        "Sending you positive vibes, {name}! ⚡",
        "May your day be filled with joy, {name}! 🌈",
        "Wishing you good health and prosperity, {name}! 💪",
        "May luck be on your side always, {name}! 🍀",
        "Hope you have an amazing journey ahead, {name}! 🚀",
        "Wishing you endless happiness, {name}! 💖"
        ];

        const generateWishes = () => {
        if (!name.trim()) {
alert('Please enter your name first!');
      return;
              }

              const newWishes = [];

        // Using for loop to generate 5 random wishes
        for (let i = 0; i < 5; i++) {
        const randomIndex = Math.floor(Math.random() * wishTemplates.length);
        const wish = wishTemplates[randomIndex].replace('{name}', name);
      newWishes.push(wish);
    }

setWishes(newWishes);
  };

          const clearAll = () => {
setName('');
setWishes([]);
  };

          return (
    <div className="min-h-screen bg-gradient-to-br from-purple-500 via-pink-500 to-orange-400 flex items-center justify-center p-6">
      <div className="bg-white rounded-3xl shadow-2xl p-8 max-w-2xl w-full">
        <div className="text-center mb-8">
          <div className="flex justify-center mb-4">
            <Gift className="w-16 h-16 text-pink-500 animate-bounce" />
          </div>
          <h1 className="text-4xl font-bold text-gray-800 mb-2">
Random Wish Generator
        </h1>
          <p className="text-gray-600">Enter your name and get magical wishes!</p>
        </div>

        <div className="mb-6">
          <label className="block text-gray-700 font-semibold mb-2">
Your Name:
          </label>
          <input
type="text"
value={name}
onChange={(e) => setName(e.target.value)}
placeholder="Enter your name here..."
className="w-full px-4 py-3 border-2 border-purple-300 rounded-lg focus:outline-none focus:border-purple-500 text-lg"
onKeyPress={(e) => e.key === 'Enter' && generateWishes()}
        />
        </div>

        <div className="flex gap-3 mb-6">
          <button
onClick={generateWishes}
className="flex-1 bg-gradient-to-r from-purple-500 to-pink-500 text-white font-bold py-3 px-6 rounded-lg hover:from-purple-600 hover:to-pink-600 transition-all duration-300 flex items-center justify-center gap-2 shadow-lg"
        >
            <Sparkles className="w-5 h-5" />
Generate Wishes
          </button>
          
          <button
onClick={clearAll}
className="bg-gray-200 text-gray-700 font-bold py-3 px-6 rounded-lg hover:bg-gray-300 transition-all duration-300"
        >
Clear
        </button>
        </div>

        {wishes.length > 0 && (
          <div className="space-y-3">
            <h2 className="text-2xl font-bold text-gray-800 mb-4 flex items-center gap-2">
              <Heart className="w-6 h-6 text-red-500" />
Your Wishes:
            </h2>

        {wishes.map((wish, index) => (
              <div
key={index}
className="bg-gradient-to-r from-purple-100 to-pink-100 p-4 rounded-lg border-l-4 border-purple-500 transform hover:scale-105 transition-transform duration-200"
        >
                <div className="flex items-start gap-3">
                  <Star className="w-5 h-5 text-yellow-500 flex-shrink-0 mt-1" />
                  <p className="text-gray-800 text-lg">{wish}</p>
                </div>
              </div>
        ))}
          </div>
        )}

        {wishes.length === 0 && (
          <div className="text-center text-gray-400 py-8">
            <p className="text-lg">Enter your name and click the button to receive wishes! 🎁</p>
          </div>
        )}
      </div>
    </div>
        );
        };

export default RandomWishGenerator;