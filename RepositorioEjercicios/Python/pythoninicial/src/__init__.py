from pytube import YouTube

video_path = input("Link: ")
downloader = YouTube(video_path)
downloader.streams.filter(progressive=True, file_extension='mp4').order_by('resolution').descend().first().download()

"""
https://youtu.be/nc3lc9uimoM?si=EQLVjI-pK5yqvNdT
https://youtu.be/dPHFJBZTtMw?si=K8xWchXatbuaJC2V
print("Enter the destination (leave blank for current directory)")
destination = str(input(">> ")) or '.'

# download the file
out_file = file.download(output_path=destination)

# save the file
base, ext = os.path.splitext(out_file)
new_file = base + type_file
os.rename(out_file, new_file)
"""