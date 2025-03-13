const prevButton = document.querySelector('.prev-button');
const nextButton = document.querySelector('.next-button');
const sliderImages = document.querySelector('.slider-images');
const images = document.querySelectorAll('.slider-images img');

let currentIndex = 0;
const totalImages = images.length;

function showImage(index) {
  if (index < 0) {
    currentIndex = totalImages - 1;
  } else if (index >= totalImages) {
    currentIndex = 0;
  }
  sliderImages.style.transform = `translateX(-${currentIndex * 100}%)`;
}

prevButton.addEventListener('click', () => {
  currentIndex--;
  showImage(currentIndex);
});

nextButton.addEventListener('click', () => {
  currentIndex++;
  showImage(currentIndex);
});

// Initialize the slider
showImage(currentIndex);
