const imageUrls = [
    "4.jpg","1.jpg","2.jpg ", "3.jpg"
    ];
    
    
        // Initialize variables
        let currentIndex = 0;
    
        // Get the slider container and slider elements
        const slider = document.querySelector('.slider');
    
        // Function to load the images
        function loadImages() {
            imageUrls.forEach(url => {
                const img = document.createElement('img');
                img.src = url;
                img.classList.add('slide');
                slider.appendChild(img);
            });
        }
    
        // Function to move to the next or previous slide
        function moveSlide(step) {
            currentIndex += step;
    
            // Loop back to first image if at the end or last image if at the start
            if (currentIndex < 0) {
                currentIndex = imageUrls.length - 1;
            } else if (currentIndex >= imageUrls.length) {
                currentIndex = 0;
            }
    
            updateSliderPosition();
        }
    
        // Update the slider position to show the current image
        function updateSliderPosition() {
            const offset = -currentIndex * 600; // Each image width is 600px
            slider.style.transform = `translateX(${offset}px)`;
        }
    
        // Load images on page load
        window.onload = () => {
            loadImages();
            updateSliderPosition(); // Initial update
        };
    