import requests

API_KEY = "AIzaSyBYo1t0alK0CBPfxae1ruyvhyP2tE-rDJ0"
CSE_ID = "6589371c378b54a22"

def read_input_file(file_path):
    with open(file_path, 'r') as file:
        return file.read().strip()

def google_search(query, api_key, cse_id):
    url = "https://www.googleapis.com/customsearch/v1"
    params = {
        "q": query,
        "key": api_key,
        "cx": cse_id
    }
    response = requests.get(url, params=params)
    if response.status_code == 200:
        return response.json().get("items", [])
    else:
        print("Error:", response.status_code, response.text)
        return []

def save_results_to_file(results, output_file_path):
    with open(output_file_path, 'w', encoding='utf-8') as f:
        if not results:
            f.write("No results found.\n")
        else:
            for item in results:
                f.write(f"Title: {item['title']}\n")
                f.write(f"Link: {item['link']}\n\n")

def main():
    input_file_path = "C:\\Users\\S Naga Varun\\eclipse-workspace\\Java_Project\\user_input.txt"
    output_file_path = "C:\\Users\\S Naga Varun\\eclipse-workspace\\Java_Project\\ai_output.txt"

    user_profile = read_input_file(input_file_path)
    print("Searching jobs for profile:", user_profile)

    search_query = f"Job opportunities for {user_profile}"
    results = google_search(search_query, API_KEY, CSE_ID)

    save_results_to_file(results, output_file_path)

if __name__ == "__main__":
    main()
